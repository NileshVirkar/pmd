// comment
/* comment
comment
*/
contract SimpleStorage {
    uint storedData;
    function set(uint x) {
        storedData = x;
    }
    /* comment
comment
*/


    function get() constant returns (uint retVal) {
        return storedData;
    }
}