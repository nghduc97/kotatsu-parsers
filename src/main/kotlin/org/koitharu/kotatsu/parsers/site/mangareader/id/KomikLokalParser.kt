package org.koitharu.kotatsu.parsers.site.mangareader.id

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.config.ConfigKey
import org.koitharu.kotatsu.parsers.model.MangaSource
import org.koitharu.kotatsu.parsers.site.mangareader.MangaReaderParser
import java.text.SimpleDateFormat
import java.util.*

@MangaSourceParser("KOMIKLOKAL", "Komik Lokal", "id")
internal class KomikLokalParser(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.KOMIKLOKAL, pageSize = 20, searchPageSize = 10) {
	override val configKeyDomain: ConfigKey.Domain
		get() = ConfigKey.Domain("komikmirror.art")

	override val listUrl: String
		get() = "/manga"
	override val tableMode: Boolean
		get() = false

	override val chapterDateFormat: SimpleDateFormat = SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH)
}