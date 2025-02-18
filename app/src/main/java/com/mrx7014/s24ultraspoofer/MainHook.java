/*
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.mrx7014.s24ultraspoofer;

import android.os.Build;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class MainHook implements IXposedHookLoadPackage {

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {        
        XposedBridge.log("ALU Spoof: Hooking into: " + lpparam.packageName);
        // ro.system_ext.model
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM_EXT.MODEL", "VER-N49");

        // ro.product.model
        XposedHelpers.setStaticObjectField(Build.class, "PRODUCT.MODEL", "VER-N49");

        // ro.product.model
        XposedHelpers.setStaticObjectField(Build.class, "PRODUCT.PRODUCT.MODEL", "VER-N49");

        // ro.product.vendor.model
        XposedHelpers.setStaticObjectField(Build.class, "VENDOR.MODEL", "VER-N49");

        // ro.product.system.model
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM.MODEL", "VER-N49");

        // ro.product.system.model
        XposedHelpers.setStaticObjectField(Build.class, "ODM.MODEL", "VER-N49");

        // ro.product.system.model
        XposedHelpers.setStaticObjectField(Build.class, "VENDOR_DLKM.MODEL", "VER-N49");

        // ro.product.model
        XposedHelpers.setStaticObjectField(Build.class, "PRODUCT.BOOTIMAGE.MODEL", "VER-N49");

        // ro.product.model
        XposedHelpers.setStaticObjectField(Build.class, "FACTORY.MODEL", "VER-N49");
    }
}
