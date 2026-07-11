package com.applovin.mediation.nativeAds.adPlacer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.C1804o;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f51118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f51119c = new TreeSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f51120d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f51121e = 256;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f51122f = 4;

    public void addFixedPosition(int i2) {
        this.f51119c.add(Integer.valueOf(i2));
    }

    public String getAdUnitId() {
        return this.f51117a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f51119c;
    }

    public int getMaxAdCount() {
        return this.f51121e;
    }

    public int getMaxPreloadedAdCount() {
        return this.f51122f;
    }

    @Nullable
    public String getPlacement() {
        return this.f51118b;
    }

    public int getRepeatingInterval() {
        return this.f51120d;
    }

    public boolean hasValidPositioning() {
        return !this.f51119c.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.f51120d >= 2;
    }

    public void resetFixedPositions() {
        this.f51119c.clear();
    }

    public void setMaxAdCount(int i2) {
        this.f51121e = i2;
    }

    public void setMaxPreloadedAdCount(int i2) {
        this.f51122f = i2;
    }

    public void setPlacement(@Nullable String str) {
        this.f51118b = str;
    }

    public void setRepeatingInterval(int i2) {
        if (i2 >= 2) {
            this.f51120d = i2;
            C1804o.g("MaxAdPlacerSettings", "Repeating interval set to " + i2);
            return;
        }
        this.f51120d = 0;
        C1804o.j("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i2 + ", which is less than minimum value of 2");
    }

    @NonNull
    public String toString() {
        return "MaxAdPlacerSettings{adUnitId='" + this.f51117a + "', fixedPositions=" + this.f51119c + ", repeatingInterval=" + this.f51120d + ", maxAdCount=" + this.f51121e + ", maxPreloadedAdCount=" + this.f51122f + '}';
    }

    public MaxAdPlacerSettings(String str) {
        this.f51117a = str;
    }
}
