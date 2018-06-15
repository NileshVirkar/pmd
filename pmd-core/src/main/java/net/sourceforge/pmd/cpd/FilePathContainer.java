/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.cpd;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressWarnings("PMD")
public final class FilePathContainer {

    private Map<String, Integer> filePaths;
    private static FilePathContainer instance = null;
    private static Object mutex = new Object();

    private static final ThreadLocal<AtomicInteger> TOKEN_COUNT = new ThreadLocal<AtomicInteger>() {
        @Override
        protected AtomicInteger initialValue() {
            return new AtomicInteger(0);
        }
    };

    private FilePathContainer() {
        filePaths = new HashMap<>();
    }

    public static FilePathContainer getFilePathContainer() {
        if (instance == null) {
            synchronized (mutex) {
                if (instance == null) {
                    instance = new FilePathContainer();
                }
            }
        }
        return instance;
    }

    public int setOrGetFilePath(String filePath) {
        Integer index = filePaths.get(filePath);
        if (index != null && index > 0) {
            return index;
        } else {
            index = TOKEN_COUNT.get().incrementAndGet();
            filePaths.put(filePath, index);
            return index;
        }
    }

    public String getFilePath(int index) {
        return getKeyByValue(filePaths, index);
    }

    public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
