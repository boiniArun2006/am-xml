package com.alightcreative.app.motion.scene;

import android.net.Uri;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/alightcreative/app/motion/scene/CacheKey;", "", "uri", "Landroid/net/Uri;", "flipped", "", "<init>", "(Landroid/net/Uri;Z)V", "getUri", "()Landroid/net/Uri;", "getFlipped", "()Z", "component1", "component2", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class CacheKey {
    private final boolean flipped;
    private final Uri uri;

    public static /* synthetic */ CacheKey copy$default(CacheKey cacheKey, Uri uri, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uri = cacheKey.uri;
        }
        if ((i2 & 2) != 0) {
            z2 = cacheKey.flipped;
        }
        return cacheKey.copy(uri, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getFlipped() {
        return this.flipped;
    }

    public final CacheKey copy(Uri uri, boolean flipped) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return new CacheKey(uri, flipped);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CacheKey)) {
            return false;
        }
        CacheKey cacheKey = (CacheKey) other;
        return Intrinsics.areEqual(this.uri, cacheKey.uri) && this.flipped == cacheKey.flipped;
    }

    public int hashCode() {
        return (this.uri.hashCode() * 31) + Boolean.hashCode(this.flipped);
    }

    public String toString() {
        return "CacheKey(uri=" + this.uri + ", flipped=" + this.flipped + ")";
    }

    public CacheKey(Uri uri, boolean z2) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.uri = uri;
        this.flipped = z2;
    }

    public final boolean getFlipped() {
        return this.flipped;
    }

    public final Uri getUri() {
        return this.uri;
    }
}
