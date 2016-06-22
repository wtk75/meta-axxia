require recipes-core/images/core-image-minimal-dev.bb

IMAGE_INSTALL = " \
run-postinsts \
busybox-udhcpc \
base-files \
udev \
base-passwd \
sysvinit \
netbase \
util-linux-libblkid \
busybox-syslog \
modutils-initscripts \
sysvinit-pidof \
busybox \
update-rc.d \
packagegroup-core-boot \
packagegroup-core-buildessential \
util-linux-libuuid \
udev-cache \
libkmod \
sysvinit-inittab \
init-ifupdown \
initscripts \
acl \
at \
attr \
autofs \
base-files \
base-passwd \
bash \
bc \
beecrypt \
bind \
bison \
bluez5 \
busybox \
bzip2 \
coreutils \
cpio \
cracklib \
cronie \
curl \
db \
dbus \
dbus-glib \
diffutils \
e2fsprogs \
e2fsprogs-e2fsck \
e2fsprogs-mke2fs \
e2fsprogs-tune2fs \
e2fsprogs-badblocks \
ed \
elfutils \
ethtool \
expat \
file \
findutils \
flac \
flex \
gawk \
gdb \
gdbserver \
gettext \
glib-2.0 \
gmp \
gnutls \
grep \
groff \
gzip \
hdparm \
hostap-utils \
icu \
inetutils \
inetutils-telnetd \
initscripts \
iproute2 \
iptables \
iputils \
irda-utils \
kexec-tools \
kmod \
ldd \
less \
libaio \
libcap \
libcheck \
libdaemon \
libevent \
libffi \
libgcrypt \
libgpg-error \
libice \
libnfsidmap \
libnl \
libnss-mdns \
libogg \
libpam \
libpcap \
libpcre \
libsamplerate0 \
libsm \
libsndfile1 \
libtasn1 \
libtirpc \
libtool \
libusb1 \
libusb-compat \
libxau \
libxcb \
libxdmcp \
logrotate \
lrzsz \
lzo \
man \
man-pages \
mdadm \
mktemp \
modutils-initscripts \
msmtp \
mtd-utils \
ncurses \
netbase \
net-tools \
nfs-utils \
nfs-utils-client \
openssh \
openssh-sftp \
openssl \
opkg \
opkg-arch-config \
ossp-uuid \
parted \
pciutils \
perl \
pkgconfig \
popt \
portmap \
ppp \
procps \
psmisc \
python-core \
python-modules \
python-netserver \
lttng-modules \
lttng-tools \
lttng-ust \
quota \
readline \
rpcbind \
rpm \
sed \
setserial \
shadow \
shadow-securetty \
sqlite3 \
stat \
strace \
sudo \
sysfsutils \
sysklogd \
sysvinit \
tar \
tcl \
tcpdump \
tcp-wrappers \
time \
tzdata \
udev \
udev-extraconf \
unzip \
update-rc.d \
usbutils \
util-linux \
util-macros \
watchdog \
wget \
which \
wireless-tools \
wpa-supplicant \
ypbind-mt \
yp-tools  \
zip \
zlib \
gfortran \
gfortran-symlinks \
libgfortran \
libgfortran-dev \
libgfortran-dbg \
libgfortran-staticdev \
perf \
"

DESCRIPTION = ""

SDKIMAGE_FEATURES = "dev-pkgs dbg-pkgs staticdev-pkgs"
