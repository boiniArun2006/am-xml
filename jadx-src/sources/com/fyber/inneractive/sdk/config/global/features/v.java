package com.fyber.inneractive.sdk.config.global.features;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class v extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u f53365e = u.NONE;

    public v() {
        super("video_player");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.i
    public final i b() {
        v vVar = new v();
        a(vVar);
        return vVar;
    }

    public final u c() {
        String strA = a("click_action", f53365e.mKey);
        for (u uVar : u.values()) {
            if (strA.equalsIgnoreCase(uVar.mKey)) {
                return uVar;
            }
        }
        return u.NONE;
    }
}
