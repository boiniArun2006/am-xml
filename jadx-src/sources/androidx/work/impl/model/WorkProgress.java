package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.Entity;
import androidx.work.Data;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Entity
@RestrictTo
public class WorkProgress {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f42944n;
    public final Data rl;

    public WorkProgress(String str, Data data) {
        this.f42944n = str;
        this.rl = data;
    }
}
