package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import com.applovin.mediation.MaxReward;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class MaxRewardImpl implements MaxReward {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f49031b;

    public static MaxReward createDefault() {
        return create(0, "");
    }

    public static MaxReward create(int i2, String str) {
        return new MaxRewardImpl(i2, str);
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.f49031b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.f49030a;
    }

    @NonNull
    public String toString() {
        return "MaxReward{amount=" + this.f49031b + ", label=" + this.f49030a + "}";
    }

    private MaxRewardImpl(int i2, String str) {
        if (i2 >= 0) {
            this.f49030a = str;
            this.f49031b = i2;
            return;
        }
        throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
    }
}
