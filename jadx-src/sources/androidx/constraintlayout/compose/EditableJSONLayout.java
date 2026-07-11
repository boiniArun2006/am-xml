package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.Registry;
import androidx.constraintlayout.core.state.RegistryCallback;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\b!\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u000e\u0010\bJ\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001f\u0010\u0005R\u0016\u0010\"\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010'\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010+R\u0016\u0010.\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010-R\u0016\u00100\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010/R\u0018\u00101\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010-R\u0016\u00103\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010-¨\u00064"}, d2 = {"Landroidx/constraintlayout/compose/EditableJSONLayout;", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "", AppLovinEventTypes.USER_VIEWED_CONTENT, "<init>", "(Ljava/lang/String;)V", "", "XQ", "()V", "Landroidx/compose/runtime/MutableState;", "", "needsUpdate", "o", "(Landroidx/compose/runtime/MutableState;)V", "WPU", "Z", "()Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.NAME, "r", "Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "nr", "()Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "", "ck", "()I", "Uo", TtmlNode.TAG_INFORMATION, "xMQ", "Landroidx/constraintlayout/compose/LayoutInfoFlags;", "mUb", "()Landroidx/constraintlayout/compose/LayoutInfoFlags;", "S", c.f62177j, "I", "forcedWidth", "t", "forcedHeight", "O", "Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "forcedDrawDebug", "J2", "Landroidx/compose/runtime/MutableState;", "updateFlag", "Landroidx/constraintlayout/compose/LayoutInfoFlags;", "layoutInformationMode", "Ljava/lang/String;", "layoutInformation", "J", "last", "debugName", "g", "currentContent", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@PublishedApi
public abstract class EditableJSONLayout implements LayoutInformationReceiver {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private MutableState updateFlag;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private String debugName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String currentContent;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int forcedWidth = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int forcedHeight = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private MotionLayoutDebugFlags forcedDrawDebug = MotionLayoutDebugFlags.UNKNOWN;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private LayoutInfoFlags layoutInformationMode = LayoutInfoFlags.NONE;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private String layoutInformation = "";

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private long last = System.nanoTime();

    protected void S(String content) {
        CLObject cLObjectIF;
        this.currentContent = content;
        try {
            CLObject cLObjectNr = CLParser.nr(content);
            if (cLObjectNr != null) {
                boolean z2 = this.debugName == null;
                if (z2 && (cLObjectIF = cLObjectNr.iF("Header")) != null) {
                    this.debugName = cLObjectIF.N("exportAs");
                    this.layoutInformationMode = LayoutInfoFlags.BOUNDS;
                }
                if (z2) {
                    return;
                }
                WPU();
            }
        } catch (CLParsingException | Exception unused) {
        }
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    /* JADX INFO: renamed from: Uo, reason: from getter */
    public int getForcedHeight() {
        return this.forcedHeight;
    }

    protected final void WPU() {
        MutableState mutableState = this.updateFlag;
        if (mutableState != null) {
            Intrinsics.checkNotNull(mutableState);
            MutableState mutableState2 = this.updateFlag;
            Intrinsics.checkNotNull(mutableState2);
            mutableState.setValue(Long.valueOf(((Number) mutableState2.getValue()).longValue() + 1));
        }
    }

    protected final void XQ() {
        try {
            S(this.currentContent);
            if (this.debugName != null) {
                Registry.n().rl(this.debugName, new RegistryCallback() { // from class: androidx.constraintlayout.compose.EditableJSONLayout$initialization$callback$1
                });
            }
        } catch (CLParsingException unused) {
        }
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final String getCurrentContent() {
        return this.currentContent;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    /* JADX INFO: renamed from: ck, reason: from getter */
    public int getForcedWidth() {
        return this.forcedWidth;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    /* JADX INFO: renamed from: mUb, reason: from getter */
    public LayoutInfoFlags getLayoutInformationMode() {
        return this.layoutInformationMode;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    /* JADX INFO: renamed from: nr, reason: from getter */
    public MotionLayoutDebugFlags getForcedDrawDebug() {
        return this.forcedDrawDebug;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public void o(MutableState needsUpdate) {
        this.updateFlag = needsUpdate;
    }

    public final void r(String name) {
        this.debugName = name;
    }

    public EditableJSONLayout(String str) {
        this.currentContent = str;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public void xMQ(String information) {
        this.last = System.nanoTime();
        this.layoutInformation = information;
    }
}
