SUMMARY = "Tool for writing very fast and very flexible scanners"
DESCRIPTION = "A free and open-source lexer generator for C, C++ and Go. It compiles regular expressions to determinisitic finite automata and encodes the automata in the form of a program in the target language. Unlike any other such tool, re2c focuses on generating high efficient code for regular expression matching. As a result this allows a much broader range of use than any traditional lexer."
HOMEPAGE = "http://re2c.org/"
BUGTRACKER = "https://github.com/skvadrik/re2c/issues"
SECTION = "devel"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=64eca4d8a3b67f9dc7656094731a2c8d"

SRC_URI = "${GITHUB_BASE_URI}/download/${PV}/${BPN}-${PV}.tar.xz"
SRC_URI[sha256sum] = "5e52ce0e26326115e41bc45d34dc2d5e10f2e44ed3a413fa2a826aa3500c8d56"
GITHUB_BASE_URI = "https://github.com/skvadrik/re2c/releases"

BBCLASSEXTEND = "native nativesdk"

inherit autotools github-releases
