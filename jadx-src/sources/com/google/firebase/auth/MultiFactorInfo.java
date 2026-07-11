package com.google.firebase.auth;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class MultiFactorInfo extends AbstractSafeParcelable {
    public abstract String Bu();

    public abstract long T3L();

    public abstract String getDisplayName();

    public abstract String p0N();

    public abstract JSONObject toJson();
}
