package androidx.view.compose;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.view.FullyDrawnReporter;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\t\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R&\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/activity/compose/ReportDrawnComposition;", "Lkotlin/Function0;", "", "Landroidx/activity/FullyDrawnReporter;", "fullyDrawnReporter", "", "predicate", "<init>", "(Landroidx/activity/FullyDrawnReporter;Lkotlin/jvm/functions/Function0;)V", "t", "(Lkotlin/jvm/functions/Function0;)V", "rl", "()V", "nr", c.f62177j, "Landroidx/activity/FullyDrawnReporter;", "Lkotlin/jvm/functions/Function0;", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "O", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "snapshotStateObserver", "Lkotlin/Function1;", "J2", "Lkotlin/jvm/functions/Function1;", "checkReporter", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnComposition\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
final class ReportDrawnComposition implements Function0<Unit> {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Function1 checkReporter;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateObserver snapshotStateObserver;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final FullyDrawnReporter fullyDrawnReporter;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Function0 predicate;

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(final Function0 predicate) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        this.snapshotStateObserver.ck(predicate, this.checkReporter, new Function0<Unit>() { // from class: androidx.activity.compose.ReportDrawnComposition$observeReporter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                booleanRef.element = ((Boolean) predicate.invoke()).booleanValue();
            }
        });
        if (booleanRef.element) {
            nr();
        }
    }

    public final void nr() {
        this.snapshotStateObserver.qie(this.predicate);
        if (!this.fullyDrawnReporter.O()) {
            this.fullyDrawnReporter.Uo();
        }
        rl();
    }

    public void rl() {
        this.snapshotStateObserver.gh();
        this.snapshotStateObserver.XQ();
    }

    public ReportDrawnComposition(FullyDrawnReporter fullyDrawnReporter, Function0 function0) {
        this.fullyDrawnReporter = fullyDrawnReporter;
        this.predicate = function0;
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new Function1<Function0<? extends Unit>, Unit>() { // from class: androidx.activity.compose.ReportDrawnComposition$snapshotStateObserver$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function02) {
                n(function02);
                return Unit.INSTANCE;
            }

            public final void n(Function0 function02) {
                function02.invoke();
            }
        });
        snapshotStateObserver.Z();
        this.snapshotStateObserver = snapshotStateObserver;
        this.checkReporter = new ReportDrawnComposition$checkReporter$1(this);
        fullyDrawnReporter.rl(this);
        if (!fullyDrawnReporter.O()) {
            fullyDrawnReporter.t();
            t(function0);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        rl();
        return Unit.INSTANCE;
    }
}
