package mfo;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j implements w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f70931n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f70931n == ((j) obj).f70931n;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f70931n)});
    }

    @Override // mfo.w6
    public float n(RectF rectF) {
        return this.f70931n;
    }

    public j(float f3) {
        this.f70931n = f3;
    }
}
