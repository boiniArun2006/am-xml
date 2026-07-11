package stX;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.internal.format.parser.ParseException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class C {

    private static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f73341n;
        private final eO rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f73342t;

        public j(Object obj, eO parserStructure, int i2) {
            Intrinsics.checkNotNullParameter(parserStructure, "parserStructure");
            this.f73341n = obj;
            this.rl = parserStructure;
            this.f73342t = i2;
        }

        public final int n() {
            return this.f73342t;
        }

        public final Object rl() {
            return this.f73341n;
        }

        public final eO t() {
            return this.rl;
        }
    }

    public static final class n implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((Dsr) obj2).rl()), Integer.valueOf(((Dsr) obj).rl()));
        }
    }

    public static eO n(eO commands) {
        Intrinsics.checkNotNullParameter(commands, "commands");
        return commands;
    }

    public static final w6 rl(eO eOVar, CharSequence input, w6 initialContainer, int i2) throws ParseException {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(initialContainer, "initialContainer");
        ArrayList arrayList = new ArrayList();
        List listMutableListOf = CollectionsKt.mutableListOf(new j(initialContainer, eOVar, i2));
        while (true) {
            j jVar = (j) CollectionsKt.removeLastOrNull(listMutableListOf);
            if (jVar == null) {
                if (arrayList.size() > 1) {
                    CollectionsKt.sortWith(arrayList, new n());
                }
                throw new ParseException(arrayList);
            }
            w6 w6Var = (w6) ((w6) jVar.rl()).nr();
            int iN = jVar.n();
            eO eOVarT = jVar.t();
            int size = eOVarT.rl().size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    Object objN = ((Pl) eOVarT.rl().get(i3)).n(w6Var, input, iN);
                    if (objN instanceof Integer) {
                        iN = ((Number) objN).intValue();
                        i3++;
                    } else {
                        if (!(objN instanceof Dsr)) {
                            throw new IllegalStateException(("Unexpected parse result: " + objN).toString());
                        }
                        arrayList.add((Dsr) objN);
                    }
                } else if (!eOVarT.n().isEmpty()) {
                    int size2 = eOVarT.n().size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i5 = size2 - 1;
                            listMutableListOf.add(new j(w6Var, (eO) eOVarT.n().get(size2), iN));
                            if (i5 < 0) {
                                break;
                            }
                            size2 = i5;
                        }
                    }
                } else {
                    if (iN == input.length()) {
                        return w6Var;
                    }
                    arrayList.add(new Dsr(iN, o.f73378n));
                }
            }
        }
    }

    public static /* synthetic */ w6 t(eO eOVar, CharSequence charSequence, w6 w6Var, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return rl(eOVar, charSequence, w6Var, i2);
    }
}
