package org.koitharu.kotatsu.parsers.site.mangareader.id

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.config.ConfigKey
import org.koitharu.kotatsu.parsers.model.MangaSource
import org.koitharu.kotatsu.parsers.site.mangareader.MangaReaderParser
import java.text.SimpleDateFormat

@MangaSourceParser("SHEAKOMIK", "Sheakomik", "id")
internal class Sheakomik(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.SHEAKOMIK, pageSize = 40, searchPageSize = 40) {
	override val configKeyDomain: ConfigKey.Domain
		get() = ConfigKey.Domain("sheakomik.com")

	override val listUrl: String
		get() = "/manga"
	override val tableMode: Boolean
		get() = false

	override val chapterDateFormat: SimpleDateFormat = SimpleDateFormat("MMM d, yyyy", idLocale)

}