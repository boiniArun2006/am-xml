package androidx.webkit.internal;

import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import ep.oxM.esLNYym;
import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class WebMessageAdapter implements WebMessageBoundaryInterface {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String[] f42527t = {esLNYym.GzgqWQgQplv};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WebMessageCompat f42528n;

    private static WebMessagePortCompat[] n(InvocationHandler[] invocationHandlerArr) {
        WebMessagePortCompat[] webMessagePortCompatArr = new WebMessagePortCompat[invocationHandlerArr.length];
        for (int i2 = 0; i2 < invocationHandlerArr.length; i2++) {
            webMessagePortCompatArr[i2] = new WebMessagePortImpl(invocationHandlerArr[i2]);
        }
        return webMessagePortCompatArr;
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public String getData() {
        return this.f42528n.t();
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public InvocationHandler getMessagePayload() {
        WebMessagePayloadAdapter webMessagePayloadAdapter;
        int iO = this.f42528n.O();
        if (iO == 0) {
            webMessagePayloadAdapter = new WebMessagePayloadAdapter(this.f42528n.t());
        } else {
            if (iO != 1) {
                throw new IllegalStateException("Unknown web message payload type: " + this.f42528n.O());
            }
            byte[] bArrRl = this.f42528n.rl();
            Objects.requireNonNull(bArrRl);
            webMessagePayloadAdapter = new WebMessagePayloadAdapter(bArrRl);
        }
        return SuF.j.t(webMessagePayloadAdapter);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public InvocationHandler[] getPorts() {
        WebMessagePortCompat[] webMessagePortCompatArrNr = this.f42528n.nr();
        if (webMessagePortCompatArrNr == null) {
            return null;
        }
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[webMessagePortCompatArrNr.length];
        for (int i2 = 0; i2 < webMessagePortCompatArrNr.length; i2++) {
            invocationHandlerArr[i2] = webMessagePortCompatArrNr[i2].n();
        }
        return invocationHandlerArr;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return f42527t;
    }

    public static WebMessageCompat rl(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        WebMessagePortCompat[] webMessagePortCompatArrN = n(webMessageBoundaryInterface.getPorts());
        if (WebViewFeatureInternal.iF.t()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) SuF.j.n(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type != 0) {
                if (type != 1) {
                    return null;
                }
                return new WebMessageCompat(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), webMessagePortCompatArrN);
            }
            return new WebMessageCompat(webMessagePayloadBoundaryInterface.getAsString(), webMessagePortCompatArrN);
        }
        return new WebMessageCompat(webMessageBoundaryInterface.getData(), webMessagePortCompatArrN);
    }
}
