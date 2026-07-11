package com.applovin.impl.mediation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class MaxNetworkResponseInfoImpl implements MaxNetworkResponseInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxNetworkResponseInfo.AdLoadState f49022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxMediatedNetworkInfo f49023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bundle f49024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f49025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f49026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f49027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final MaxError f49028g;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MaxNetworkResponseInfoImpl)) {
            return false;
        }
        MaxNetworkResponseInfoImpl maxNetworkResponseInfoImpl = (MaxNetworkResponseInfoImpl) obj;
        if (!maxNetworkResponseInfoImpl.canEqual(this) || isBidding() != maxNetworkResponseInfoImpl.isBidding() || getLatencyMillis() != maxNetworkResponseInfoImpl.getLatencyMillis()) {
            return false;
        }
        MaxNetworkResponseInfo.AdLoadState adLoadState = getAdLoadState();
        MaxNetworkResponseInfo.AdLoadState adLoadState2 = maxNetworkResponseInfoImpl.getAdLoadState();
        if (adLoadState != null ? !adLoadState.equals(adLoadState2) : adLoadState2 != null) {
            return false;
        }
        MaxMediatedNetworkInfo mediatedNetwork = getMediatedNetwork();
        MaxMediatedNetworkInfo mediatedNetwork2 = maxNetworkResponseInfoImpl.getMediatedNetwork();
        if (mediatedNetwork != null ? !mediatedNetwork.equals(mediatedNetwork2) : mediatedNetwork2 != null) {
            return false;
        }
        Bundle credentials = getCredentials();
        Bundle credentials2 = maxNetworkResponseInfoImpl.getCredentials();
        if (credentials != null ? !credentials.equals(credentials2) : credentials2 != null) {
            return false;
        }
        String bCode = getBCode();
        String bCode2 = maxNetworkResponseInfoImpl.getBCode();
        if (bCode != null ? !bCode.equals(bCode2) : bCode2 != null) {
            return false;
        }
        MaxError error = getError();
        MaxError error2 = maxNetworkResponseInfoImpl.getError();
        return error != null ? error.equals(error2) : error2 == null;
    }

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f49029a;

        static {
            int[] iArr = new int[MaxNetworkResponseInfo.AdLoadState.values().length];
            f49029a = iArr;
            try {
                iArr[MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49029a[MaxNetworkResponseInfo.AdLoadState.AD_LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof MaxNetworkResponseInfoImpl;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxNetworkResponseInfo.AdLoadState getAdLoadState() {
        return this.f49022a;
    }

    public String getBCode() {
        return this.f49027f;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public Bundle getCredentials() {
        return this.f49024c;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    @Nullable
    public MaxError getError() {
        return this.f49028g;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public long getLatencyMillis() {
        return this.f49026e;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxMediatedNetworkInfo getMediatedNetwork() {
        return this.f49023b;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public boolean isBidding() {
        return this.f49025d;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MaxResponseInfo{adLoadState=" + this.f49022a + ", mediatedNetwork=" + this.f49023b + ", credentials=" + this.f49024c + ", isBidding=" + this.f49025d);
        int i2 = a.f49029a[this.f49022a.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
            }
            sb.append("}");
            return sb.toString();
        }
        sb.append(", error=");
        sb.append(this.f49028g);
        sb.append(", latencyMillis=");
        sb.append(this.f49026e);
        sb.append("}");
        return sb.toString();
    }

    public MaxNetworkResponseInfoImpl(MaxNetworkResponseInfo.AdLoadState adLoadState, MaxMediatedNetworkInfo maxMediatedNetworkInfo, Bundle bundle, boolean z2, long j2, String str, @Nullable MaxError maxError) {
        this.f49022a = adLoadState;
        this.f49023b = maxMediatedNetworkInfo;
        this.f49024c = bundle;
        this.f49025d = z2;
        this.f49026e = j2;
        this.f49027f = str;
        this.f49028g = maxError;
    }

    public int hashCode() {
        int i2;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        if (isBidding()) {
            i2 = 79;
        } else {
            i2 = 97;
        }
        long latencyMillis = getLatencyMillis();
        int i3 = ((i2 + 59) * 59) + ((int) (latencyMillis ^ (latencyMillis >>> 32)));
        MaxNetworkResponseInfo.AdLoadState adLoadState = getAdLoadState();
        int i5 = i3 * 59;
        int iHashCode5 = 43;
        if (adLoadState == null) {
            iHashCode = 43;
        } else {
            iHashCode = adLoadState.hashCode();
        }
        int i7 = i5 + iHashCode;
        MaxMediatedNetworkInfo mediatedNetwork = getMediatedNetwork();
        int i8 = i7 * 59;
        if (mediatedNetwork == null) {
            iHashCode2 = 43;
        } else {
            iHashCode2 = mediatedNetwork.hashCode();
        }
        int i9 = i8 + iHashCode2;
        Bundle credentials = getCredentials();
        int i10 = i9 * 59;
        if (credentials == null) {
            iHashCode3 = 43;
        } else {
            iHashCode3 = credentials.hashCode();
        }
        int i11 = i10 + iHashCode3;
        String bCode = getBCode();
        int i12 = i11 * 59;
        if (bCode == null) {
            iHashCode4 = 43;
        } else {
            iHashCode4 = bCode.hashCode();
        }
        int i13 = i12 + iHashCode4;
        MaxError error = getError();
        int i14 = i13 * 59;
        if (error != null) {
            iHashCode5 = error.hashCode();
        }
        return i14 + iHashCode5;
    }
}
