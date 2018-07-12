// Copyright 2018 The Go Authors. All rights reserved.
// Use of this source code is governed by a BSD-style

package main

import (
    "crypto/rand"
    "crypto/rsa"
)

var userAndHostname string

func init() {
    u, _ := user.Current()
}
