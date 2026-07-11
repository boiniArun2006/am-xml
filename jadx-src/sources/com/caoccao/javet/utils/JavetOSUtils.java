package com.caoccao.javet.utils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class JavetOSUtils {
    public static final boolean IS_ANDROID;
    public static final boolean IS_ARM;
    public static final boolean IS_ARM64;
    public static final boolean IS_LINUX;
    public static final boolean IS_MACOS;
    public static final boolean IS_WINDOWS;
    public static final boolean IS_X86;
    public static final boolean IS_X86_64;
    public static final String JAVA_VM_NAME;
    public static final String LINE_SEPARATOR;
    public static final String OS_ARCH;
    public static final String OS_NAME;
    public static final long PROCESS_ID;
    public static final String TEMP_DIRECTORY;
    public static final String WORKING_DIRECTORY;

    static {
        String property = System.getProperty("os.arch");
        OS_ARCH = property;
        String property2 = System.getProperty("os.name");
        OS_NAME = property2;
        String property3 = System.getProperty("java.vm.name");
        JAVA_VM_NAME = property3;
        boolean zStartsWith = property3.startsWith("Dalvik");
        IS_ANDROID = zStartsWith;
        IS_LINUX = property2.startsWith("Linux") && !zStartsWith;
        IS_MACOS = property2.startsWith("Mac OS") && !zStartsWith;
        IS_WINDOWS = property2.startsWith("Windows") && !zStartsWith;
        IS_ARM = property.startsWith("armeabi") || property.startsWith("armv7") || property.startsWith("arm32") || property.equals("arm");
        IS_ARM64 = property.startsWith("arm64") || property.startsWith("armv8") || property.equals("aarch64");
        IS_X86 = property.matches("^(x86_32|x8632|x86|i[3-6]86|ia32|x32)$");
        IS_X86_64 = property.matches("^(x86_64|x8664|amd64|ia32e|em64t|x64)$");
        LINE_SEPARATOR = System.getProperty("line.separator");
        TEMP_DIRECTORY = System.getProperty("java.io.tmpdir");
        WORKING_DIRECTORY = System.getProperty("user.dir");
        PROCESS_ID = 1L;
    }

    private JavetOSUtils() {
    }

    public static int getCPUCount() {
        return Runtime.getRuntime().availableProcessors();
    }
}
