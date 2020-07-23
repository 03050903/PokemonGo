/*
 * Copyright 2020. hi-dhl (Jack Deng)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hi.dhl.pokemon.model

import android.os.Parcelable
import androidx.recyclerview.widget.DiffUtil
import kotlinx.android.parcel.Parcelize

/**
 * <pre>
 *     author: dhl
 *     date  : 2020/7/11
 *     desc  :
 * </pre>
 */

@Parcelize
data class PokemonItemModel(
    var id: String = "",
    val name: String,
    val url: String
) : Parcelable {
    companion object {
        val diffCallback = object : DiffUtil.ItemCallback<PokemonItemModel>() {
            override fun areItemsTheSame(
                oldItem: PokemonItemModel,
                newItem: PokemonItemModel
            ): Boolean =
                oldItem.name == newItem.name

            override fun areContentsTheSame(
                oldItem: PokemonItemModel,
                newItem: PokemonItemModel
            ): Boolean =
                oldItem == newItem
        }
    }
}