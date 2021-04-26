import { Client } from './client';

describe('Client', () => {
  it('should create an instance', () => {
    expect(new Client("Paulo","paulo@gmail.com",1)).toBeTruthy();
  });
});
