DESCRIPTION = "GUI tool for storage configuration using blivet library"
HOMEPAGE = "https://github.com/rhinstaller/blivet-gui"
LICENSE = "GPLv2+"
SECTION = "devel/python"

LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

S = "${WORKDIR}/git"
B = "${S}"

SRCREV = "393c139c09dc44167b64f47771650ce9aa9d469f"
SRC_URI = "git://github.com/rhinstaller/blivet-gui;branch=master \
"

inherit distro_features_check
REQUIRED_DISTRO_FEATURES = "x11 systemd"

inherit setuptools3 python3native

RDEPENDS_${PN} = "python3-pygobject python3 \
                  python3-blivet gtk+3  \
                  python3-pid libreport \
"

FILES_${PN} += " \
    ${datadir}/* \
    "