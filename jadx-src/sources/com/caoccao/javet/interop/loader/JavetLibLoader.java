package com.caoccao.javet.interop.loader;

import com.caoccao.javet.enums.JSRuntimeType;
import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetLogger;
import com.caoccao.javet.utils.ArrayUtils;
import com.caoccao.javet.utils.JavetDefaultLogger;
import com.caoccao.javet.utils.JavetOSUtils;
import com.caoccao.javet.utils.SimpleMap;
import com.caoccao.javet.utils.StringUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class JavetLibLoader {
    private static final String ANDROID_ABI_ARM = "armeabi-v7a";
    private static final String ANDROID_ABI_ARM64 = "arm64-v8a";
    private static final String ANDROID_ABI_X86 = "x86";
    private static final String ANDROID_ABI_X86_64 = "x86_64";
    private static final String ARCH_ARM = "arm";
    private static final String ARCH_ARM64 = "arm64";
    private static final String ARCH_X86 = "x86";
    private static final String ARCH_X86_64 = "x86_64";
    private static final int BUFFER_LENGTH = 4096;
    private static final String CHMOD = "chmod";
    private static final String DOT = ".";
    private static final String I18N_SUFFIX = "-i18n";
    private static final String LIB_FILE_EXTENSION_ANDROID = "so";
    private static final String LIB_FILE_EXTENSION_LINUX = "so";
    private static final String LIB_FILE_EXTENSION_MACOS = "dylib";
    private static final String LIB_FILE_EXTENSION_WINDOWS = "dll";
    private static final String LIB_FILE_NAME_FORMAT = "libjavet-{0}-{1}-{2}{3}.v.{4}.{5}";
    private static final String LIB_FILE_NAME_FOR_ANDROID_FORMAT = "libjavet-{0}-{1}{2}.v.{3}.{4}";
    private static final String LIB_FILE_NAME_PREFIX = "lib";
    public static final String LIB_VERSION = "4.1.4";
    private static final long MIN_LAST_MODIFIED_GAP_IN_MILLIS = 60000;
    private static final String OS_ANDROID = "android";
    private static final String OS_LINUX = "linux";
    private static final String OS_MACOS = "macos";
    private static final String OS_WINDOWS = "windows";
    private static final String RESOURCE_NAME_FORMAT = "/{0}";
    private static final String XRR = "755";
    private final JSRuntimeType jsRuntimeType;
    private volatile boolean loaded;
    private static final IJavetLogger LOGGER = new JavetDefaultLogger(JavetLibLoader.class.getName());
    private static IJavetLibLoadingListener libLoadingListener = new JavetLibLoadingListener();

    private String getAndroidABI() {
        if (!JavetOSUtils.IS_ANDROID) {
            return null;
        }
        if (JavetOSUtils.IS_ARM) {
            return ANDROID_ABI_ARM;
        }
        if (JavetOSUtils.IS_ARM64) {
            return ANDROID_ABI_ARM64;
        }
        if (JavetOSUtils.IS_X86) {
            return "x86";
        }
        if (JavetOSUtils.IS_X86_64) {
            return "x86_64";
        }
        return null;
    }

    private String getFileExtension() {
        if (JavetOSUtils.IS_WINDOWS) {
            return LIB_FILE_EXTENSION_WINDOWS;
        }
        if (JavetOSUtils.IS_LINUX) {
            return "so";
        }
        if (JavetOSUtils.IS_MACOS) {
            return LIB_FILE_EXTENSION_MACOS;
        }
        if (JavetOSUtils.IS_ANDROID) {
            return "so";
        }
        return null;
    }

    public static IJavetLibLoadingListener getLibLoadingListener() {
        return libLoadingListener;
    }

    private String getNormalizedLibFilePath(String str) {
        boolean z2 = true;
        if (JavetOSUtils.IS_LINUX) {
            if (str.endsWith(".so")) {
                str = str.substring(0, str.length() - 3);
            }
        } else if (JavetOSUtils.IS_ANDROID) {
            if (str.endsWith(".so")) {
                str = str.substring(0, str.length() - 3);
            }
        } else if (!JavetOSUtils.IS_MACOS) {
            z2 = false;
        } else if (str.endsWith(".dylib")) {
            str = str.substring(0, str.length() - 6);
        }
        return (z2 && str.startsWith(LIB_FILE_NAME_PREFIX)) ? str.substring(3) : str;
    }

    private String getOSArch() {
        if (JavetOSUtils.IS_WINDOWS) {
            return "x86_64";
        }
        if (JavetOSUtils.IS_LINUX) {
            return JavetOSUtils.IS_ARM64 ? ARCH_ARM64 : "x86_64";
        }
        if (JavetOSUtils.IS_MACOS) {
            return JavetOSUtils.IS_ARM64 ? ARCH_ARM64 : "x86_64";
        }
        if (!JavetOSUtils.IS_ANDROID) {
            return null;
        }
        if (JavetOSUtils.IS_ARM) {
            return ARCH_ARM;
        }
        if (JavetOSUtils.IS_ARM64) {
            return ARCH_ARM64;
        }
        if (JavetOSUtils.IS_X86) {
            return "x86";
        }
        if (JavetOSUtils.IS_X86_64) {
            return "x86_64";
        }
        return null;
    }

    private String getOSName() {
        if (JavetOSUtils.IS_WINDOWS) {
            return OS_WINDOWS;
        }
        if (JavetOSUtils.IS_LINUX) {
            return OS_LINUX;
        }
        if (JavetOSUtils.IS_MACOS) {
            return OS_MACOS;
        }
        if (JavetOSUtils.IS_ANDROID) {
            return "android";
        }
        return null;
    }

    public JSRuntimeType getJSRuntimeType() {
        return this.jsRuntimeType;
    }

    public String getResourceFileName() throws JavetException {
        String str = MessageFormat.format(RESOURCE_NAME_FORMAT, JavetOSUtils.IS_ANDROID ? StringUtils.join("/", LIB_FILE_NAME_PREFIX, getAndroidABI(), getLibFileName()) : getLibFileName());
        if (JavetLibLoader.class.getResource(str) != null) {
            return str;
        }
        throw new JavetException(JavetError.LibraryNotFound, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_PATH, str));
    }

    public boolean isLoaded() {
        return this.loaded;
    }

    public void load() throws JavetException {
        if (this.loaded) {
            return;
        }
        String absolutePath = null;
        try {
            boolean zIsLibInSystemPath = libLoadingListener.isLibInSystemPath(this.jsRuntimeType);
            boolean zIsDeploy = libLoadingListener.isDeploy(this.jsRuntimeType);
            if (zIsLibInSystemPath) {
                absolutePath = getLibFileName();
            } else if (zIsDeploy) {
                File libPath = libLoadingListener.getLibPath(this.jsRuntimeType);
                Objects.requireNonNull(libPath, "Lib path cannot be null");
                String resourceFileName = getResourceFileName();
                File file = JavetOSUtils.IS_ANDROID ? libPath : new File(libPath, Long.toString(JavetOSUtils.PROCESS_ID));
                if (!file.exists() && !file.mkdirs()) {
                    LOGGER.logError("Failed to create {0}.", file.getAbsolutePath());
                }
                purge(libPath);
                File absoluteFile = new File(file, getLibFileName()).getAbsoluteFile();
                absolutePath = absoluteFile.getAbsolutePath();
                deployLibFile(resourceFileName, absoluteFile);
            } else {
                File libPath2 = libLoadingListener.getLibPath(this.jsRuntimeType);
                Objects.requireNonNull(libPath2, "Lib path cannot be null");
                absolutePath = new File(libPath2, getLibFileName()).getAbsolutePath();
            }
            try {
                if (zIsLibInSystemPath) {
                    System.loadLibrary(getNormalizedLibFilePath(absolutePath));
                } else {
                    System.load(absolutePath);
                }
                this.loaded = true;
            } catch (Throwable th) {
                if (!libLoadingListener.isSuppressingError(this.jsRuntimeType)) {
                    throw th;
                }
                LOGGER.warn(th.getMessage());
                this.loaded = true;
            }
        } catch (Throwable th2) {
            LOGGER.logError(th2, th2.getMessage(), new Object[0]);
            throw new JavetException(JavetError.FailedToReadPath, SimpleMap.of(JavetError.PARAMETER_PATH, absolutePath), th2);
        }
    }

    public JavetLibLoader(JSRuntimeType jSRuntimeType) {
        Objects.requireNonNull(jSRuntimeType);
        this.jsRuntimeType = jSRuntimeType;
        this.loaded = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void deployLibFile(String str, File file) {
        FileOutputStream fileOutputStream;
        if (file.exists() && file.canWrite()) {
            try {
                file.delete();
            } catch (Throwable unused) {
                LOGGER.logWarn("Failed to delete {0} because it is locked.", file.getAbsolutePath());
                return;
            }
        }
        byte[] bArr = new byte[4096];
        try {
            InputStream resourceAsStream = JavetLibLoader.class.getResourceAsStream(str);
            try {
                fileOutputStream = new FileOutputStream(file.getAbsolutePath());
            } finally {
            }
            if (resourceAsStream != null) {
                while (true) {
                    try {
                        int i2 = resourceAsStream.read(bArr);
                        if (i2 == -1) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, i2);
                        }
                    } finally {
                    }
                }
                if (!JavetOSUtils.IS_LINUX && !JavetOSUtils.IS_MACOS) {
                    if (JavetOSUtils.IS_ANDROID) {
                    }
                } else {
                    try {
                        Runtime.getRuntime().exec(new String[]{CHMOD, XRR, file.getAbsolutePath()}).waitFor();
                    } catch (Throwable unused2) {
                    }
                }
            }
            fileOutputStream.close();
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
        } catch (Throwable unused3) {
            LOGGER.logWarn("Failed to write to {0} because it is locked.", file.getAbsolutePath());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0086 A[Catch: all -> 0x007e, TryCatch #1 {all -> 0x007e, blocks: (B:2:0x0000, B:4:0x0006, B:7:0x000e, B:9:0x0018, B:11:0x001d, B:39:0x00a7, B:14:0x0031, B:35:0x0086, B:37:0x008c, B:38:0x009a, B:33:0x0080, B:30:0x0070, B:40:0x00ab, B:42:0x00b1, B:17:0x003b, B:19:0x0041, B:21:0x0044, B:23:0x0048, B:25:0x0050, B:28:0x0062), top: B:48:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c A[Catch: all -> 0x007e, TryCatch #1 {all -> 0x007e, blocks: (B:2:0x0000, B:4:0x0006, B:7:0x000e, B:9:0x0018, B:11:0x001d, B:39:0x00a7, B:14:0x0031, B:35:0x0086, B:37:0x008c, B:38:0x009a, B:33:0x0080, B:30:0x0070, B:40:0x00ab, B:42:0x00b1, B:17:0x003b, B:19:0x0041, B:21:0x0044, B:23:0x0048, B:25:0x0050, B:28:0x0062), top: B:48:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a A[Catch: all -> 0x007e, TryCatch #1 {all -> 0x007e, blocks: (B:2:0x0000, B:4:0x0006, B:7:0x000e, B:9:0x0018, B:11:0x001d, B:39:0x00a7, B:14:0x0031, B:35:0x0086, B:37:0x008c, B:38:0x009a, B:33:0x0080, B:30:0x0070, B:40:0x00ab, B:42:0x00b1, B:17:0x003b, B:19:0x0041, B:21:0x0044, B:23:0x0048, B:25:0x0050, B:28:0x0062), top: B:48:0x0000, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void purge(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    File[] fileArrListFiles = file.listFiles();
                    if (ArrayUtils.isNotEmpty(fileArrListFiles)) {
                        for (File file2 : fileArrListFiles) {
                            if (file2.lastModified() + 60000 <= System.currentTimeMillis()) {
                                if (file2.isDirectory()) {
                                    try {
                                        File[] fileArrListFiles2 = file2.listFiles();
                                        if (fileArrListFiles2 != null && fileArrListFiles2.length > 0) {
                                            for (File file3 : fileArrListFiles2) {
                                                if (file3.delete()) {
                                                    LOGGER.logDebug("Deleted {0}.", file3.getAbsolutePath());
                                                } else {
                                                    LOGGER.logDebug("{0} is locked.", file3.getAbsolutePath());
                                                    if (!file2.delete()) {
                                                    }
                                                }
                                            }
                                        } else if (!file2.delete()) {
                                            LOGGER.logDebug("Deleted {0}.", file2.getAbsolutePath());
                                        } else {
                                            LOGGER.logDebug("{0} is locked.", file2.getAbsolutePath());
                                        }
                                    } catch (Throwable th) {
                                        LOGGER.logError(th, "Failed to delete {0}.", file2.getAbsolutePath());
                                    }
                                } else if (file2.isFile()) {
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                if (!file.delete()) {
                    LOGGER.logError("Failed to delete {0}.", file.getAbsolutePath());
                }
            }
        } catch (Throwable th2) {
            LOGGER.logError(th2, "Failed to clean up {0}.", file.getAbsolutePath());
        }
    }

    public static void setLibLoadingListener(IJavetLibLoadingListener iJavetLibLoadingListener) {
        Objects.requireNonNull(iJavetLibLoadingListener);
        libLoadingListener = iJavetLibLoadingListener;
    }

    public String getLibFileName() throws JavetException {
        String fileExtension = getFileExtension();
        String oSName = getOSName();
        if (fileExtension != null && oSName != null) {
            String str = "";
            if (JavetOSUtils.IS_ANDROID) {
                String name = this.jsRuntimeType.getName();
                if (this.jsRuntimeType.isI18nEnabled()) {
                    str = I18N_SUFFIX;
                }
                return MessageFormat.format(LIB_FILE_NAME_FOR_ANDROID_FORMAT, name, oSName, str, LIB_VERSION, fileExtension);
            }
            String oSArch = getOSArch();
            if (oSArch != null) {
                String name2 = this.jsRuntimeType.getName();
                if (this.jsRuntimeType.isI18nEnabled()) {
                    str = I18N_SUFFIX;
                }
                return MessageFormat.format(LIB_FILE_NAME_FORMAT, name2, oSName, oSArch, str, LIB_VERSION, fileExtension);
            }
            throw new JavetException(JavetError.OSNotSupported, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_OS, JavetOSUtils.OS_ARCH));
        }
        throw new JavetException(JavetError.OSNotSupported, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_OS, JavetOSUtils.OS_NAME));
    }
}
