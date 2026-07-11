package androidx.profileinstaller;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
enum FileSectionType {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f40932n;

    public long rl() {
        return this.f40932n;
    }

    FileSectionType(long j2) {
        this.f40932n = j2;
    }
}
