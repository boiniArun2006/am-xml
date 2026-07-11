package com.alightcreative.app.motion.templates;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.alightcreative.app.motion.templates.Template;
import com.alightcreative.app.motion.templates.w6;
import j$.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Ml {

    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f46383n = new j();

        j() {
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0008  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Integer n(String str, String str2) {
            boolean zJ2;
            int iCompareTo = 1;
            if (str == null) {
                zJ2 = str2 == null;
            } else if (str2 != null) {
                zJ2 = Template.Tag.J2(str, str2);
            }
            if (zJ2) {
                iCompareTo = 0;
            } else {
                com.alightcreative.app.motion.templates.j jVar = com.alightcreative.app.motion.templates.j.J2;
                if (!(str == null ? false : Template.Tag.J2(str, jVar.nr()))) {
                    iCompareTo = str2 != null ? Template.Tag.J2(str2, jVar.nr()) : false ? -1 : StringsKt.compareTo(str, str2, true);
                }
            }
            return Integer.valueOf(iCompareTo);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            Template.Tag tag = (Template.Tag) obj;
            Template.Tag tag2 = (Template.Tag) obj2;
            return n(tag != null ? tag.getValue() : null, tag2 != null ? tag2.getValue() : null);
        }
    }

    public static final boolean HI(List hasAnyUnseenTemplates, Set seenTemplatesIDs, String str) {
        Intrinsics.checkNotNullParameter(hasAnyUnseenTemplates, "$this$hasAnyUnseenTemplates");
        Intrinsics.checkNotNullParameter(seenTemplatesIDs, "seenTemplatesIDs");
        return (str == null ? false : Template.Tag.J2(str, Template.Tag.INSTANCE.n())) || !WPU(hasAnyUnseenTemplates, seenTemplatesIDs, str).isEmpty();
    }

    public static final List Ik(List list, w6 sortingKind, Template.Tag.w6 tagKind) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(sortingKind, "sortingKind");
        Intrinsics.checkNotNullParameter(tagKind, "tagKind");
        Map mapXQ = XQ(list, tagKind);
        if (!(sortingKind instanceof w6.n)) {
            if (!(sortingKind instanceof w6.j)) {
                throw new NoWhenBranchMatchedException();
            }
            Set setKeySet = mapXQ.keySet();
            final j jVar = j.f46383n;
            return CollectionsKt.sortedWith(setKeySet, new Comparator() { // from class: pP.w6
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return com.alightcreative.app.motion.templates.Ml.o(jVar, obj, obj2);
                }
            });
        }
        Set setKeySet2 = mapXQ.keySet();
        final LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setKeySet2, 10)), 16));
        for (Object obj : setKeySet2) {
            linkedHashMap.put(obj, Boolean.valueOf(HI(list, ((w6.n) sortingKind).rl(), ((Template.Tag) obj).getValue())));
        }
        Set setEntrySet = mapXQ.entrySet();
        final Function2 function2 = new Function2() { // from class: pP.j
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return Integer.valueOf(com.alightcreative.app.motion.templates.Ml.Z(linkedHashMap, (Map.Entry) obj2, (Map.Entry) obj3));
            }
        };
        List listSortedWith = CollectionsKt.sortedWith(setEntrySet, new Comparator() { // from class: pP.n
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return com.alightcreative.app.motion.templates.Ml.r(function2, obj2, obj3);
            }
        });
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listSortedWith) {
            if (((Number) ((Map.Entry) obj2).getValue()).intValue() >= ((w6.n) sortingKind).n()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Template.Tag.rl(((Template.Tag) ((Map.Entry) it.next()).getKey()).getValue()));
        }
        return arrayList2;
    }

    public static final String S(List thumbnailURL, String tag) {
        Object next;
        Intrinsics.checkNotNullParameter(thumbnailURL, "$this$thumbnailURL");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Template.Tag.J2(tag, Template.Tag.INSTANCE.n())) {
            return "file:///android_asset/almo_jump.gif";
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : thumbnailURL) {
            if (((Template) obj).getThumbnailUrl().length() > 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Template) next).getTags().contains(Template.Tag.rl(tag))) {
                break;
            }
        }
        Template template = (Template) next;
        if (template != null) {
            return template.getThumbnailUrl();
        }
        return null;
    }

    public static final List WPU(List unseenTemplates, Set seenTemplatesIDs, String str) {
        Intrinsics.checkNotNullParameter(unseenTemplates, "$this$unseenTemplates");
        Intrinsics.checkNotNullParameter(seenTemplatesIDs, "seenTemplatesIDs");
        ArrayList arrayList = new ArrayList();
        for (Object obj : unseenTemplates) {
            Template template = (Template) obj;
            if (!seenTemplatesIDs.contains(template.getTemplateId()) && (str == null || template.getTags().contains(Template.Tag.rl(str)))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Map XQ(List list, Template.Tag.w6 kind) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(kind, "kind");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Template template = (Template) it.next();
            List<Template.Tag> tags = template.getTags();
            ArrayList arrayList = new ArrayList();
            for (Object obj : tags) {
                if (mUb(((Template.Tag) obj).getValue()) == kind) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = CollectionsKt.toSet(arrayList).iterator();
            while (it2.hasNext()) {
                String value = ((Template.Tag) it2.next()).getValue();
                Template.Tag tagRl = Template.Tag.rl(value);
                Integer num = (Integer) linkedHashMap.get(Template.Tag.rl(value));
                linkedHashMap.put(tagRl, Integer.valueOf((num != null ? num.intValue() : 0) + 1 + template.getDownloadsCount()));
            }
        }
        return linkedHashMap;
    }

    public static final Integer az(String stringResId) {
        Intrinsics.checkNotNullParameter(stringResId, "$this$stringResId");
        if (Template.Tag.J2(stringResId, Template.Tag.INSTANCE.n())) {
            return 2132019137;
        }
        com.alightcreative.app.motion.templates.j jVarN = com.alightcreative.app.motion.templates.j.f46391O.n(stringResId);
        if (jVarN != null) {
            return Integer.valueOf(jVarN.t());
        }
        n nVarN = n.f46405O.n(stringResId);
        if (nVarN != null) {
            return Integer.valueOf(nVarN.t());
        }
        return null;
    }

    public static final String ck(String localizedCopy, Context context) {
        String string;
        Intrinsics.checkNotNullParameter(localizedCopy, "$this$localizedCopy");
        Intrinsics.checkNotNullParameter(context, "context");
        Integer numAz = az(localizedCopy);
        if (numAz != null && (string = context.getString(numAz.intValue())) != null) {
            return string;
        }
        if (localizedCopy.length() <= 0) {
            return localizedCopy;
        }
        StringBuilder sb = new StringBuilder();
        String strValueOf = String.valueOf(localizedCopy.charAt(0));
        Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        sb.append((Object) upperCase);
        String strSubstring = localizedCopy.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }

    public static final String gh(String localizedCopy, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(localizedCopy, "$this$localizedCopy");
        composer.eF(1898940977);
        if (ComposerKt.v()) {
            ComposerKt.p5(1898940977, i2, -1, "com.alightcreative.app.motion.templates.<get-localizedCopy> (TemplateExtensions.kt:28)");
        }
        Integer numAz = az(localizedCopy);
        String strT = numAz == null ? null : StringResources_androidKt.t(numAz.intValue(), composer, 0);
        if (strT != null) {
            localizedCopy = strT;
        } else if (localizedCopy.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String strValueOf = String.valueOf(localizedCopy.charAt(0));
            Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb.append((Object) upperCase);
            String strSubstring = localizedCopy.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb.append(strSubstring);
            localizedCopy = sb.toString();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return localizedCopy;
    }

    public static final Template.Tag.w6 mUb(String kind) {
        Intrinsics.checkNotNullParameter(kind, "$this$kind");
        return com.alightcreative.app.motion.templates.j.f46391O.n(kind) != null ? Template.Tag.w6.f46388n : Template.Tag.w6.f46389t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String qie(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return Template.Tag.t(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(lowerCase, " ", "", false, 4, (Object) null), "-", "", false, 4, (Object) null), "_", "", false, 4, (Object) null));
    }

    public static final String ty(String trackingValue) {
        Intrinsics.checkNotNullParameter(trackingValue, "$this$trackingValue");
        String lowerCase = trackingValue.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return StringsKt.replace$default(lowerCase, " ", "_", false, 4, (Object) null);
    }

    public static final List xMQ(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Template) obj).getDownloadsCount() > 0) {
                arrayList.add(obj);
            }
        }
        final Function2 function2 = new Function2() { // from class: pP.Ml
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return Integer.valueOf(com.alightcreative.app.motion.templates.Ml.J2((Template) obj2, (Template) obj3));
            }
        };
        List listSortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: pP.I28
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return com.alightcreative.app.motion.templates.Ml.Uo(function2, obj2, obj3);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((Template) obj2).getDownloadsCount() == 0) {
                arrayList2.add(obj2);
            }
        }
        return CollectionsKt.plus((Collection) listSortedWith, (Iterable) CollectionsKt.shuffled(arrayList2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int J2(Template template, Template template2) {
        OffsetDateTime creationDate = template.getCreationDate();
        OffsetDateTime creationDate2 = template2.getCreationDate();
        if (template.getDownloadsCount() != template2.getDownloadsCount()) {
            return -Intrinsics.compare(template.getDownloadsCount(), template2.getDownloadsCount());
        }
        if (creationDate2 == null) {
            return 1;
        }
        if (creationDate == null) {
            return -1;
        }
        return creationDate.compareTo(creationDate2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Uo(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Z(Map map, Map.Entry entry, Map.Entry entry2) {
        boolean zBooleanValue;
        Intrinsics.checkNotNull(entry);
        String value = ((Template.Tag) entry.getKey()).getValue();
        int iIntValue = ((Number) entry.getValue()).intValue();
        Intrinsics.checkNotNull(entry2);
        String value2 = ((Template.Tag) entry2.getKey()).getValue();
        int iIntValue2 = ((Number) entry2.getValue()).intValue();
        Boolean bool = (Boolean) map.get(Template.Tag.rl(value));
        boolean zBooleanValue2 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Boolean bool2 = (Boolean) map.get(Template.Tag.rl(value2));
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        }
        if (zBooleanValue != zBooleanValue2) {
            if (zBooleanValue) {
                return -1;
            }
            return 1;
        }
        if (iIntValue != iIntValue2) {
            return -Intrinsics.compare(iIntValue, iIntValue2);
        }
        return value.compareTo(value2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }
}
