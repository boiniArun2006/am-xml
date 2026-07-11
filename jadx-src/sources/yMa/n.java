package yMa;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class n {
    private static String nr(String str, String str2) {
        return String.format("%s/project/%s/performance/app/android:%s", "https://console.firebase.google.com", str, str2);
    }

    public static String n(String str, String str2, String str3) {
        return String.format("%s/troubleshooting/trace/DURATION_TRACE/%s?utm_source=%s&utm_medium=%s", nr(str, str2), str3, "perf-android-sdk", "android-ide");
    }

    public static String rl(String str, String str2) {
        return String.format("%s/trends?utm_source=%s&utm_medium=%s", nr(str, str2), "perf-android-sdk", "android-ide");
    }

    public static String t(String str, String str2, String str3) {
        return String.format("%s/troubleshooting/trace/SCREEN_TRACE/%s?utm_source=%s&utm_medium=%s", nr(str, str2), str3, "perf-android-sdk", "android-ide");
    }
}
