FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI += "file://0001-skip-slow-dirs.patch"

#do_patch () {
#    pwd > /tmp/pwd.txt
#}
