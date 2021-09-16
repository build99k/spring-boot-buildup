package com.oogo.api.service.stock;

import com.oogo.api.component.stock.JsoupComponent;
import com.oogo.api.domain.dto.stock.KospiStockDto;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StockService {

  private final JsoupComponent jsoupComponent;

  public List<KospiStockDto> getKosPiStockList() {
    return jsoupComponent.getKosPiStockList();
  }
}
