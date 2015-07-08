FILESEXTRAPATHS_prepend := "${THISDIR}/conf/${LSI_SRC}/linux-${KV}/${MACHINE}/${LINUX_KERNEL_TYPE}:"

require linux-yocto.inc

LSI_KERNEL_TAG = "7.8.1.43"
LINUX_VERSION = "3.4.88-${LSI_KERNEL_TAG}"

KBRANCH = "standard/lsi/base"
KREPO = "git://github.com/lsigithub/lsi_axxia_yocto_public.git"

SRCREV_machine="f297efad34421eba772f1d30c4189a19539493c1"
SRCREV_meta="03cd6f841fd2566b033db19eb6665228ea406adf"

SRC_URI = "${KREPO};nocheckout=1;branch=${KBRANCH},${KMETA};name=machine,meta"
SRC_URI += "file://fit"
SRC_URI += "file://defconfig"