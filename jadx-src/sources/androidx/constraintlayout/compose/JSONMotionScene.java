package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.ConstraintSetParser;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@ExperimentalMotionApi
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R0\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001aj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR0\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001aj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010#\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Landroidx/constraintlayout/compose/JSONMotionScene;", "Landroidx/constraintlayout/compose/EditableJSONLayout;", "Landroidx/constraintlayout/compose/MotionScene;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppLovinEventTypes.USER_VIEWED_CONTENT, "", "Ik", "(Ljava/lang/String;Ljava/lang/String;)V", "HI", "az", "(Ljava/lang/String;)Ljava/lang/String;", "aYN", "", "O", "()F", "ty", "()V", "Landroidx/constraintlayout/compose/ConstraintSet;", "t", "(Ljava/lang/String;)Landroidx/constraintlayout/compose/ConstraintSet;", "Landroidx/constraintlayout/compose/Transition;", "gh", "(Ljava/lang/String;)Landroidx/constraintlayout/compose/Transition;", "S", "(Ljava/lang/String;)V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "E2", "Ljava/util/HashMap;", "constraintSetsContent", "e", "transitionsContent", "X", "F", "forcedProgress", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMotionScene.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionScene.kt\nandroidx/constraintlayout/compose/JSONMotionScene\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1#2:133\n*E\n"})
public final class JSONMotionScene extends EditableJSONLayout implements MotionScene {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final HashMap constraintSetsContent;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private float forcedProgress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final HashMap transitionsContent;

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    public void HI(String name, String content) {
        this.transitionsContent.put(name, content);
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    public void Ik(String name, String content) {
        this.constraintSetsContent.put(name, content);
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    /* JADX INFO: renamed from: O, reason: from getter */
    public float getForcedProgress() {
        return this.forcedProgress;
    }

    public String aYN(String name) {
        return (String) this.transitionsContent.get(name);
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    public String az(String name) {
        return (String) this.constraintSetsContent.get(name);
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public void ty() {
        this.forcedProgress = Float.NaN;
    }

    @Override // androidx.constraintlayout.compose.EditableJSONLayout
    protected void S(String content) {
        super.S(content);
        try {
            ConstraintSetParser.aYN(this, content);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.constraintlayout.compose.MotionScene
    public Transition gh(String name) {
        CLObject cLObjectNr;
        String strAYN = aYN(name);
        if (strAYN == null) {
            return null;
        }
        try {
            cLObjectNr = CLParser.nr(strAYN);
        } catch (CLParsingException e2) {
            Log.e("CML", "Error parsing JSON " + e2);
            cLObjectNr = null;
        }
        if (cLObjectNr == null) {
            return null;
        }
        return new TransitionImpl(cLObjectNr);
    }

    @Override // androidx.constraintlayout.compose.MotionScene
    public ConstraintSet t(String name) {
        String strAz = az(name);
        if (strAz != null) {
            return ConstraintLayoutKt.O(strAz);
        }
        return null;
    }
}
