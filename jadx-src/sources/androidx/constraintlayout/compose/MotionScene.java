package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.state.CoreMotionScene;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Immutable
@ExperimentalMotionApi
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/constraintlayout/compose/MotionScene;", "Landroidx/constraintlayout/core/state/CoreMotionScene;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Landroidx/constraintlayout/compose/ConstraintSet;", "t", "(Ljava/lang/String;)Landroidx/constraintlayout/compose/ConstraintSet;", "Landroidx/constraintlayout/compose/Transition;", "gh", "(Ljava/lang/String;)Landroidx/constraintlayout/compose/Transition;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface MotionScene extends CoreMotionScene {
    Transition gh(String name);

    ConstraintSet t(String name);
}
