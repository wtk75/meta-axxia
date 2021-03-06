# adding fragments with kernel options to the final .config
SRC_URI += "file://common.scc \
	${@base_conditional('SMP', 'yes', 'file://smp.scc', '', d)} \
	${@base_conditional('LINUX_KERNEL_TYPE', 'preempt-rt', 'file://preempt-rt.scc', '', d)} \
	${@base_conditional('DBG', 'yes', 'file://dbg.scc', '', d)} \
	${@base_conditional('TESTING', 'yes', 'file://testing.scc', '', d)} \
	${@base_conditional('CHIPSET', 'XLF', 'file://xlf.scc', '', d)}"
