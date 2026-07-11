package kotlin.reflect.jvm.internal.impl.platform;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class SimplePlatform {
    private final String platformName;
    private final TargetPlatformVersion targetPlatformVersion;

    public TargetPlatformVersion getTargetPlatformVersion() {
        return this.targetPlatformVersion;
    }

    public String getTargetName() {
        return getTargetPlatformVersion().getDescription();
    }

    public String toString() {
        String targetName = getTargetName();
        if (targetName.length() > 0) {
            return this.platformName + " (" + targetName + ')';
        }
        return this.platformName;
    }
}
