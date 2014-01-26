#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Environment customizations"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

FILES_${PN} += "/home/root/.bashrc"
FILES_${PN} += "/home/root/.screenrc"
FILES_${PN} += "/home/root/setup_clanton.sh"

PR = "r0"

SRC_URI = "file://bashrc_root"
SRC_URI += "file://screenrc"
SRC_URI += "file://setup_clanton.sh"
SRC_URI += "file://.catkin"

S = "${WORKDIR}"

do_install() {
             mkdir -p ${D}/home/root
             cp ${S}/bashrc_root ${D}/home/root/.bashrc
             cp ${S}/screenrc ${D}/home/root/.screenrc
             cp ${S}/setup_clanton.sh ${D}/home/root/setup_clanton.sh
             cp ${S}/.catkin ${D}/usr
}
