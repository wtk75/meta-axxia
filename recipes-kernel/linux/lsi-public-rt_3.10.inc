
require linux-yocto.inc

LSI_KERNEL_TAG = "8.8.1.45"
LINUX_VERSION = "3.10.38-${LSI_KERNEL_TAG}"

KBRANCH = "standard/preempt-rt/lsi/base"
KREPO = "git://github.com/lsigithub/lsi_axxia_yocto_public_3.10.git"

SRCREV_machine="576cfef2bbdd19ed0ea0751530120f1b3deb19cf"
SRCREV_meta="d07bc7ba4ff00ddcd77db1026a63c327b81a35d8"