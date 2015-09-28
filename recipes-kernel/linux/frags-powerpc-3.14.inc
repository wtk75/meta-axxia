# adding fragments with kernel options to the final .config
SRC_URI += "file://common.scc \
	${@base_conditional('LINUX_KERNEL_TYPE', 'preempt-rt', 'file://preempt-rt.scc', '', d)} \
	${@base_conditional('TESTING', 'yes', 'file://testing.scc', 'file://non-testing.scc', d)} "