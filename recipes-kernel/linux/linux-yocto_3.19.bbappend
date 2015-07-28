FILESEXTRAPATHS_prepend := "${THISDIR}:"

LINUX_KERNEL_TYPE = "standard"
LSI_SRC ?= "linux-yocto"
POWER_MANAGEMENT ?= "low-power"
BIG_ENDIAN ?= "no"
DBG ?= "no"
TESTING ?= "no"
KV = "3.19"
KERNEL_EXTRA_FEATURES = ""

require ${LSI_SRC}_3.19.inc