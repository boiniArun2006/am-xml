package com.facebook.ads;

import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Keep
public class RewardData implements Serializable {
    private static final long serialVersionUID = -6264212909606201882L;
    private String mCurrency;
    private int mQuantity;
    private String mUserID;

    public RewardData(String str, String str2) {
        this(str, str2, 0);
    }

    public RewardData(String str, String str2, int i2) {
        this.mUserID = str;
        this.mCurrency = str2;
        this.mQuantity = i2;
    }

    public String getCurrency() {
        return this.mCurrency;
    }

    public int getQuantity() {
        return this.mQuantity;
    }

    public String getUserID() {
        return this.mUserID;
    }
}
