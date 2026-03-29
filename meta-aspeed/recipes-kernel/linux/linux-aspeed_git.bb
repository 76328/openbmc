KBRANCH ?= "dev-6.18"
LINUX_VERSION ?= "6.18.20"

SRC_URI = "file://${TOPDIR}/downloads/git2/github.com.openbmc.linux;type=git;bareclone=1;branch=dev-6.6;nocheckout=1"

SRCREV="1b412b0fdd7d145e25d360ad1d92ad27ba013d1d"

require linux-aspeed.inc
