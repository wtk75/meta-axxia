require u-boot-axxia.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=1707d6db1d42237583f50183a5651ecb"

PROVIDES = "virtual/bootemu"

UBOOT_EMU = "-emu"
UBOOT_MACHINE_axm5500 = "axxia-55xx-emu_config"

SRCREV = "lsi_axxia_u-boot_5.8.1.78"

PV = "2013.01.01+${SRCREV}"
PR = "r1"

SRC_URI = "git://github.com/axxia/axxia_u-boot.git"
