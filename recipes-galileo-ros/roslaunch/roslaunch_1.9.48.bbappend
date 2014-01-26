FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI += "file://0001_timeout_increase.patch"

#do_patch () {
#    pwd > /tmp/pwd.txt
#}
