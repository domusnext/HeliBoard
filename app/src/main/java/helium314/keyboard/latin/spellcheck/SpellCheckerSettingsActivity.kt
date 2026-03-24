// SPDX-License-Identifier: GPL-3.0-only
package helium314.keyboard.latin.spellcheck

import android.app.Activity
import android.os.Bundle

class SpellCheckerSettingsActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (!isFinishing) {
            finish()
        }
    }
}
