package androidx.compose.ui.autofill;

import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.geometry.Rect;
import com.caoccao.javet.values.reference.IV8ValueMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\t\u001a\u00020\u0003*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/autofill/AndroidAutofill;", "Landroid/view/ViewStructure;", "root", "", "rl", "(Landroidx/compose/ui/autofill/AndroidAutofill;Landroid/view/ViewStructure;)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", IV8ValueMap.FUNCTION_VALUES, com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroidx/compose/ui/autofill/AndroidAutofill;Landroid/util/SparseArray;)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidAutofill.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,148:1\n150#2,3:149\n34#2,6:152\n153#2:158\n37#3,2:159\n26#4:161\n26#4:162\n26#4:163\n26#4:164\n*S KotlinDebug\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill_androidKt\n*L\n101#1:149,3\n101#1:152,6\n101#1:158\n101#1:159,2\n114#1:161\n115#1:162\n116#1:163\n117#1:164\n*E\n"})
public final class AndroidAutofill_androidKt {
    public static final void rl(AndroidAutofill androidAutofill, ViewStructure viewStructure) {
        if (androidAutofill.getAutofillTree().getChildren().isEmpty()) {
            return;
        }
        int iN = AutofillApi26Helper.f31121n.n(viewStructure, androidAutofill.getAutofillTree().getChildren().size());
        for (Map.Entry entry : androidAutofill.getAutofillTree().getChildren().entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            AutofillNode autofillNode = (AutofillNode) entry.getValue();
            AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.f31121n;
            ViewStructure viewStructureUo = autofillApi26Helper.Uo(viewStructure, iN);
            autofillApi26Helper.xMQ(viewStructureUo, androidAutofill.getRootAutofillId(), iIntValue);
            autofillApi26Helper.S(viewStructureUo, iIntValue, androidAutofill.getView().getContext().getPackageName(), null, null);
            autofillApi26Helper.mUb(viewStructureUo, ContentDataType_androidKt.rl(ContentDataType.INSTANCE.n()));
            List autofillTypes = autofillNode.getAutofillTypes();
            ArrayList arrayList = new ArrayList(autofillTypes.size());
            int size = autofillTypes.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(AndroidAutofillType_androidKt.n((AutofillType) autofillTypes.get(i2)));
            }
            autofillApi26Helper.KN(viewStructureUo, (String[]) arrayList.toArray(new String[0]));
            Rect boundingBox = autofillNode.getBoundingBox();
            if (boundingBox == null) {
                Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
            } else {
                int iRound = Math.round(boundingBox.getLeft());
                int iRound2 = Math.round(boundingBox.getTop());
                int iRound3 = Math.round(boundingBox.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String());
                AutofillApi26Helper.f31121n.r(viewStructureUo, iRound, iRound2, 0, 0, iRound3 - iRound, Math.round(boundingBox.xMQ()) - iRound2);
            }
            iN++;
        }
    }

    public static final void n(AndroidAutofill androidAutofill, SparseArray sparseArray) {
        if (!androidAutofill.getAutofillTree().getChildren().isEmpty()) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                AutofillValue autofillValueN = Ml.n(sparseArray.get(iKeyAt));
                AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.f31121n;
                if (autofillApi26Helper.O(autofillValueN)) {
                    androidAutofill.getAutofillTree().rl(iKeyAt, autofillApi26Helper.te(autofillValueN).toString());
                } else if (!autofillApi26Helper.t(autofillValueN)) {
                    if (!autofillApi26Helper.nr(autofillValueN)) {
                        if (autofillApi26Helper.J2(autofillValueN)) {
                            throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    } else {
                        throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                } else {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
            }
        }
    }
}
