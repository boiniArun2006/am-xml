package com.alightcreative.app.motion.activities.main.maintabs.templates.models;

import com.alightcreative.app.motion.activities.main.maintabs.templates.models.TemplateFiltersItem;
import com.alightcreative.app.motion.templates.Template;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class j {
    public static final List n(List list, TemplateFiltersItem.Content filter, Set savedTemplateIds) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(savedTemplateIds, "savedTemplateIds");
        if (Intrinsics.areEqual(filter, TemplateFiltersItem.Content.AllTemplates.f45446O)) {
            return list;
        }
        if (Intrinsics.areEqual(filter, TemplateFiltersItem.Content.Saved.f45448O)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (savedTemplateIds.contains(((Template) obj).getTemplateId())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        if (!(filter instanceof TemplateFiltersItem.Content.Tag)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((Template) obj2).getTags().contains(Template.Tag.rl(((TemplateFiltersItem.Content.Tag) filter).getTag()))) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }
}
