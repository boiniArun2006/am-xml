package GjB;

import com.bendingspoons.spidersense.domain.entities.CompleteDebugEvent;
import com.bendingspoons.spidersense.domain.network.entities.DebugEventForBackend;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class j {
    public static final DebugEventForBackend n(CompleteDebugEvent completeDebugEvent) {
        Intrinsics.checkNotNullParameter(completeDebugEvent, "<this>");
        return new DebugEventForBackend(completeDebugEvent.getId(), completeDebugEvent.getSeverity(), completeDebugEvent.getCategories(), completeDebugEvent.getDescription(), completeDebugEvent.getErrorCode(), completeDebugEvent.getInfo(), completeDebugEvent.getCreatedAt());
    }
}
