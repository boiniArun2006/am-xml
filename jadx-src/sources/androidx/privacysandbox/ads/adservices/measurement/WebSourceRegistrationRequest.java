package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import android.view.InputEvent;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001*J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010 \u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010#\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019R\u0019\u0010&\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019R\u0019\u0010)\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010\u0019¨\u0006+"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/adservices/measurement/WebSourceRegistrationRequest;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "()Landroid/adservices/measurement/WebSourceRegistrationRequest;", "", "Landroidx/privacysandbox/ads/adservices/measurement/WebSourceParams;", "Ljava/util/List;", "getWebSourceParams", "()Ljava/util/List;", "webSourceParams", "Landroid/net/Uri;", "rl", "Landroid/net/Uri;", "getTopOriginUri", "()Landroid/net/Uri;", "topOriginUri", "Landroid/view/InputEvent;", "t", "Landroid/view/InputEvent;", "getInputEvent", "()Landroid/view/InputEvent;", "inputEvent", "nr", "getAppDestination", "appDestination", "O", "getWebDestination", "webDestination", "J2", "getVerifiedDestination", "verifiedDestination", "Builder", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebSourceRegistrationRequest {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata and from toString */
    private final Uri VerifiedDestination;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final Uri WebDestination;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final List WebSourceParams;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
    private final Uri AppDestination;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final Uri TopOriginUri;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final InputEvent InputEvent;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest$Builder;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nWebSourceRegistrationRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSourceRegistrationRequest.kt\nandroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1#2:182\n*E\n"})
    public static final class Builder {
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebSourceRegistrationRequest)) {
            return false;
        }
        WebSourceRegistrationRequest webSourceRegistrationRequest = (WebSourceRegistrationRequest) other;
        return Intrinsics.areEqual(this.WebSourceParams, webSourceRegistrationRequest.WebSourceParams) && Intrinsics.areEqual(this.WebDestination, webSourceRegistrationRequest.WebDestination) && Intrinsics.areEqual(this.AppDestination, webSourceRegistrationRequest.AppDestination) && Intrinsics.areEqual(this.TopOriginUri, webSourceRegistrationRequest.TopOriginUri) && Intrinsics.areEqual(this.InputEvent, webSourceRegistrationRequest.InputEvent) && Intrinsics.areEqual(this.VerifiedDestination, webSourceRegistrationRequest.VerifiedDestination);
    }

    public int hashCode() {
        int iHashCode = (this.WebSourceParams.hashCode() * 31) + this.TopOriginUri.hashCode();
        InputEvent inputEvent = this.InputEvent;
        if (inputEvent != null) {
            iHashCode = (iHashCode * 31) + inputEvent.hashCode();
        }
        Uri uri = this.AppDestination;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.WebDestination;
        if (uri2 != null) {
            iHashCode = (iHashCode * 31) + uri2.hashCode();
        }
        int iHashCode2 = (iHashCode * 31) + this.TopOriginUri.hashCode();
        InputEvent inputEvent2 = this.InputEvent;
        if (inputEvent2 != null) {
            iHashCode2 = (iHashCode2 * 31) + inputEvent2.hashCode();
        }
        Uri uri3 = this.VerifiedDestination;
        return uri3 != null ? (iHashCode2 * 31) + uri3.hashCode() : iHashCode2;
    }

    public String toString() {
        return "WebSourceRegistrationRequest { " + ("WebSourceParams=[" + this.WebSourceParams + "], TopOriginUri=" + this.TopOriginUri + ", InputEvent=" + this.InputEvent + ", AppDestination=" + this.AppDestination + ", WebDestination=" + this.WebDestination + ", VerifiedDestination=" + this.VerifiedDestination) + " }";
    }

    public final android.adservices.measurement.WebSourceRegistrationRequest n() {
        Q.n();
        android.adservices.measurement.WebSourceRegistrationRequest webSourceRegistrationRequestBuild = UGc.n(WebSourceParams.INSTANCE.n(this.WebSourceParams), this.TopOriginUri).setWebDestination(this.WebDestination).setAppDestination(this.AppDestination).setInputEvent(this.InputEvent).setVerifiedDestination(this.VerifiedDestination).build();
        Intrinsics.checkNotNullExpressionValue(webSourceRegistrationRequestBuild, "Builder(\n               …ion)\n            .build()");
        return webSourceRegistrationRequestBuild;
    }
}
