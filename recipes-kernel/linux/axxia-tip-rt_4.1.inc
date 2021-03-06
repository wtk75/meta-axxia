FILESEXTRAPATHS_prepend := "${THISDIR}/conf/${AXXIA_SRC}/linux-${KV}/${MACHINE}/${LINUX_KERNEL_TYPE}:"

require dt-${KARCH}.inc

AXXIA_KERNEL_TAG = "tip"
LINUX_VERSION = "4.1.28-${AXXIA_KERNEL_TAG}"
KBRANCH = "standard/preempt-rt/axxia-dev/base"
KMETA = ""
KREPO_KERNEL = "git://git@github.com/axxia/axxia_yocto_linux_4.1_private.git;protocol=ssh"
SRCREV_machine ="${AUTOREV}"
SRC_URI = "${KREPO_KERNEL};name=machine;branch=${KBRANCH}"
SRC_URI += "file://fit"
SRC_URI += "file://defconfig"
