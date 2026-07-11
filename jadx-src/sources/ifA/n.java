package ifA;

import com.bendingspoons.spidersense.domain.network.entities.sampling.SamplingRuleEntity;
import ifA.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class n {
    public static final List n(List list) {
        j fux;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SamplingRuleEntity samplingRuleEntity = (SamplingRuleEntity) it.next();
            if (samplingRuleEntity instanceof SamplingRuleEntity.Spooners) {
                fux = new j.CN3(((SamplingRuleEntity.Spooners) samplingRuleEntity).getValue());
            } else if (samplingRuleEntity instanceof SamplingRuleEntity.PremiumUsers) {
                fux = new j.I28(((SamplingRuleEntity.PremiumUsers) samplingRuleEntity).getValue());
            } else if (samplingRuleEntity instanceof SamplingRuleEntity.Categories) {
                fux = new j.n(rl(((SamplingRuleEntity.Categories) samplingRuleEntity).getValue()));
            } else if (samplingRuleEntity instanceof SamplingRuleEntity.Experiments) {
                fux = new j.w6(rl(((SamplingRuleEntity.Experiments) samplingRuleEntity).getValue()));
            } else if (samplingRuleEntity instanceof SamplingRuleEntity.Severity) {
                fux = new j.Wre(rl(((SamplingRuleEntity.Severity) samplingRuleEntity).getValue()));
            } else if (samplingRuleEntity instanceof SamplingRuleEntity.AndRule) {
                fux = new j.C0969j(n(((SamplingRuleEntity.AndRule) samplingRuleEntity).getValue()));
            } else {
                if (!(samplingRuleEntity instanceof SamplingRuleEntity.Standard)) {
                    throw new NoWhenBranchMatchedException();
                }
                fux = new j.fuX(((SamplingRuleEntity.Standard) samplingRuleEntity).getValue());
            }
            arrayList.add(fux);
        }
        return arrayList;
    }

    private static final List rl(List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SamplingRuleEntity.NamedEntry namedEntry = (SamplingRuleEntity.NamedEntry) it.next();
            arrayList.add(new j.Ml(namedEntry.getName(), namedEntry.getValue()));
        }
        return arrayList;
    }
}
