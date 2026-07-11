package xWk;

import com.bendingspoons.experiments.network.OracleExperiment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import ktm.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class w6 {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OracleExperiment.State.values().length];
            try {
                iArr[OracleExperiment.State.DRAFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OracleExperiment.State.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OracleExperiment.State.OBSERVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OracleExperiment.State.COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ktm.j rl(OracleExperiment oracleExperiment, Map map) {
        int iIntValue;
        String name;
        j.C1041j c1041j;
        int i2;
        Integer num = (Integer) map.get(oracleExperiment.getName());
        List<OracleExperiment.Segment> segments = oracleExperiment.getSegments();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        OracleExperiment.Segment segment = (OracleExperiment.Segment) CollectionsKt.getOrNull(segments, iIntValue);
        j.n nVar = null;
        if (segment != null) {
            name = segment.getName();
        } else {
            name = null;
        }
        String name2 = oracleExperiment.getName();
        if (num != null) {
            c1041j = new j.C1041j(num.intValue(), name);
        } else {
            c1041j = null;
        }
        OracleExperiment.State state = oracleExperiment.getState();
        if (state == null) {
            i2 = -1;
        } else {
            i2 = j.$EnumSwitchMapping$0[state.ordinal()];
        }
        if (i2 != -1) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            nVar = j.n.f70293r;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        nVar = j.n.J2;
                    }
                } else {
                    nVar = j.n.f70290O;
                }
            } else {
                nVar = j.n.f70294t;
            }
        }
        j.n nVar2 = nVar;
        Boolean boolIsCompatible = oracleExperiment.isCompatible();
        List<OracleExperiment.Segment> segments2 = oracleExperiment.getSegments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(segments2, 10));
        int i3 = 0;
        for (Object obj : segments2) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new j.C1041j(i3, ((OracleExperiment.Segment) obj).getName()));
            i3 = i5;
        }
        return new ktm.j(name2, c1041j, nVar2, boolIsCompatible, arrayList);
    }
}
