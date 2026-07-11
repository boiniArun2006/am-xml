package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.Entity;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Entity
@RestrictTo
public class Dependency {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f42932n;
    public final String rl;

    public Dependency(String str, String str2) {
        this.f42932n = str;
        this.rl = str2;
    }
}
