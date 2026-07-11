package oW;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.MultiFactorInfo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class YzO extends com.google.firebase.auth.w6 {
    private final MultiFactorInfo rl;

    public YzO(String str, MultiFactorInfo multiFactorInfo) {
        this.f60213n = Preconditions.checkNotEmpty(str);
        this.rl = (MultiFactorInfo) Preconditions.checkNotNull(multiFactorInfo);
    }
}
