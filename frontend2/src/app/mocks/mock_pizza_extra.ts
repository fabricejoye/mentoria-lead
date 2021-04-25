import { Pizza_extra } from 'src/app/_models/pizza_extra';

// Dados: extra, preço e duração
// [Extra bacon, 3, 0], [Sem cebola, 0, 0], [Borda recheada, 5, 5]

// Popular a partir da DB

export const PIZZAS_EXTRA: Pizza_extra[] = [
  { id: 1, extra: 'Extra bacon', price: 3, duration: 0, availability: true, creationDate: new Date()},
  { id: 2, extra: 'Sem cebola', price: 0, duration: 0, availability: true, creationDate: new Date()},
  { id: 3, extra: 'Borda recheada', price: 5, duration: 5, availability: true, creationDate: new Date()},
]
