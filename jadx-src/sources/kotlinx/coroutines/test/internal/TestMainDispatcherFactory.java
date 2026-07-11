package kotlinx.coroutines.test.internal;

import GJW.DC;
import GJW.lej;
import aC.Wre;
import aC.w6;
import dzu.AbstractC1958c;
import dzu.QJ;
import dzu.UGc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.test.internal.TestMainDispatcherFactory;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/test/internal/TestMainDispatcherFactory;", "Ldzu/QJ;", "<init>", "()V", "", "allFactories", "LGJW/DC;", "rl", "(Ljava/util/List;)LGJW/DC;", "", "t", "()I", "loadPriority", "kotlinx-coroutines-test"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTestMainDispatcherJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestMainDispatcherJvm.kt\nkotlinx/coroutines/test/internal/TestMainDispatcherFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n774#2:54\n865#2,2:55\n1971#2,14:57\n*S KotlinDebug\n*F\n+ 1 TestMainDispatcherJvm.kt\nkotlinx/coroutines/test/internal/TestMainDispatcherFactory\n*L\n9#1:54\n9#1:55,2\n10#1:57,14\n*E\n"})
public final class TestMainDispatcherFactory implements QJ {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uo() {
    }

    @Override // dzu.QJ
    public int t() {
        return Integer.MAX_VALUE;
    }

    @Override // dzu.QJ
    public DC rl(List allFactories) {
        Object obj;
        final ArrayList arrayList = new ArrayList();
        for (Object obj2 : allFactories) {
            if (((QJ) obj2) != this) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int iT = ((QJ) next).t();
                do {
                    Object next2 = it.next();
                    int iT2 = ((QJ) next2).t();
                    if (iT < iT2) {
                        next = next2;
                        iT = iT2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        final QJ qj = (QJ) obj;
        if (qj == null) {
            qj = UGc.f63557n;
        }
        return new w6(new Function0() { // from class: aC.Ml
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TestMainDispatcherFactory.J2(qj, arrayList, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lej J2(QJ qj, List list, TestMainDispatcherFactory testMainDispatcherFactory) {
        Object objM313constructorimpl;
        try {
            DC dcO = AbstractC1958c.O(qj, list);
            if (!AbstractC1958c.t(dcO)) {
                return dcO;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                dcO.n1(dcO, new Runnable() { // from class: aC.I28
                    @Override // java.lang.Runnable
                    public final void run() {
                        TestMainDispatcherFactory.Uo();
                    }
                });
                objM313constructorimpl = Result.m313constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
            }
            Wre.rl(Result.m316exceptionOrNullimpl(objM313constructorimpl));
            throw new KotlinNothingValueException();
        } catch (Throwable th2) {
            Wre.rl(th2);
            throw new KotlinNothingValueException();
        }
    }

    @Override // dzu.QJ
    public String n() {
        return QJ.j.n(this);
    }
}
